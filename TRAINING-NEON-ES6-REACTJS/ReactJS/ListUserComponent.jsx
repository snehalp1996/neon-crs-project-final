import React, { Component } from 'react'
import axios from 'axios';

class ListUserComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                users: []
        }
        this.addUser = this.addUser.bind(this);
        this.editUser = this.editUser.bind(this);
        this.deleteUser = this.deleteUser.bind(this);
    }

    deleteUser(id){
        axios.get(`http://localhost:7000/users/delete/:id`).then( res => {
            this.setState({users: this.state.users.filter(users => users.id !== id)});
        });
    }
    viewUsers(id){
        this.props.history.push(`/users/get/:id`);
    }
    editUser(id){
        this.props.history.push(`/users/:id/`);
    }

    componentDidMount(){
        axios.get(`http://localhost:7000/users/list`).then((res) => {
            this.setState({ Users: res.data});
        });
    }

    addEmployee(){
        this.props.history.push('/users');
    }

    render() {
        return (
            <div>
                 <h2 className="text-center">Users List</h2>
                 <div className = "row">
                    <button className="btn btn-primary" onClick={this.addUser}> Add User</button>
                 </div>
                 <br></br>
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> User First Name</th>
                                    <th> User Last Name</th>
                                    <th> User Email </th>
                                    <th> Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.users.map(
                                        users => 
                                        <tr key = {users.id}>
                                             <td> { users.firstName} </td>   
                                             <td> {users.lastName}</td>
                                             <td> {users.email}</td>
                                             <td>
                                                 <button onClick={ () => this.editUser(users.id)} className="btn btn-info">Update </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.deleteUser(users.id)} className="btn btn-danger">Delete </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => this.viewUser(users.id)} className="btn btn-info">View </button>
                                             </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}

export default ListUserComponent
