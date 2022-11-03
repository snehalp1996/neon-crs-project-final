import React from 'react';
import EmployeeName from './MycomponentOne.jsx';

class Employee extends React.Component {

	render() {
    return(
      <div>
      <h1>City: {this.props.emp.city}</h1>
    <EmployeeName empname={this.props.emp.name} />
   
        </div>
     );a
  }
}
export default Employee;

