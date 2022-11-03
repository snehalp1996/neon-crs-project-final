//import React from 'react';
import React, { useState, useEffect } from "react";

class MyForm extends React.Component {
   constructor(props) {
    super(props);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleEdit = this.handleEdit.bind(this);
    this.handleDelete = this.handleDelete.bind(this);
  }

  handleSubmit(e) {
    e.preventDefault();
    
    const formData=([{customerName: "vaibhav", email: "vp"},
    {customerName: "shruti", email: "sp "},
    {customerName: "kartiki", email:" kp"}] )


    for (const field in this.refs) {
      console.log(field);
      formData[field] = this.refs[field].value;
    }
    console.log('-->', formData);
   // method to REST post Data to invoke and send to server
 // Jquery code at
 // Express integrion



  }





  handleEdit(e) {
    e.preventDefault();
    
    const formData=[{customerName: "vaibhav", email: "vp"},
    {customerName: "shruti", email: "sp "},
    {customerName: "kartiki", email:" kp"}] ;

    for (const field in this.refs) {
      console.log(field);
      formData[field] = this.refs[field].value;
    }
    console.log('-->', editData);
   // method to REST post Data to invoke and send to server
 // Jquery code at
 // Express integrion


  }
  handleDelete(e) {
    e.preventDefault();
    
    const formData = {};
    for (const field in this.refs) {
      console.log(field);
      formData[field] = this.refs[field].value;
    }
    console.log('-->', deleteData);
   // method to REST post Data to invoke and send to server
 // Jquery code at
 // Express integrion


  }

  render() {
    return (
        <div>
          <form onSubmit={this.handleSubmit}>
            <input ref="phone" className="phone" type='tel' name="phone"/>
            <input ref="email" className="email" type='email' name="email"/>
            <input type="submit" value="Submit"/>
           
            
            
          </form>




          <form onEdit={this.handleEdit}>
            <input ref="phone" className="phone" type='tel' name="phone"/>
            <input ref="email" className="email" type='email' name="email"/>
            <button variant="contained" color="edit">
        Edit
      </button>
            
            
          
          </form>



          <form onDelete={this.handleDelete}>
            <input ref="phone" className="phone" type='tel' name="phone"/>
            <input ref="email" className="email" type='email' name="email"/>
            <button variant="contained" color="delete">
        Delete
      </button>
           
            
            
          </form>
             <button variant="contained" color="secondary">
        Secondary
      </button>
        </div>
    );
  }
}

export default MyForm;




