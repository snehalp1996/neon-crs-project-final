import React from 'react';

import axios from 'axios';

class UserList extends React.Component {
  
 constructor(props){
   
   super(props);
  this.state = {
    users: []
  }
}
  componentDidMount() {
    axios.get(`http://localhost:7000/users/list`)
      .then(res => {
        const users = res.data;
        this.setState({ users });
      })
  }

  render() {
    return (
      <ul>
        { this.state.users.map(user => <li>{user.first_name}</li>)}
      </ul>
    )
  }
}

export default UserList;
