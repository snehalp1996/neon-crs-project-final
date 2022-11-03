import React, { useState } from "react";

//import './App.css';



function Customer(){


  const [emps,setEmps]=useState([{customerName: "vaibhav", email: "vp"},
 {customerName: "shruti", email: "sp "},
 {customerName: "kartiki", email:" kp"}]) ;

 const addRow=()=>{
 
  let newEmp={customerName:"snehal",email:"ps@gmail.com"}
  setEmps([...emps,newEmp])
}

const updateRow=()=>{
  let index=0
  let newEmp=emps[index]
  newEmp["customerName"]="Modfied Customer";
  emps[index]=newEmp
  setEmps([...emps])
}

const deleteRow = () => {
 
  let copy_emp=[...emps]
  copy_emp.splice(0,1)
  setEmps(copy_emp)
}


return ( 
<div className = "App" >
 {emps.map( (emp,index)=>
 (
    <div key={index}>
        <h3>{emp.customerName}</h3>
        <p>{emp.email}</p>
        
    </div>
 )
 )}

<input  className="customerName" type='text' name="customerName"/>
            <input   className="email" type='email' name="email"/>
 <button onClick={addRow}>Add</button>
 <button onClick={updateRow}>Update</button>
 <button onClick={deleteRow}>Delete</button>


</div>
);
}
 
//  return(
// <div className="App">
//     <div>
//         <AddCustomer setCustomer={setCustomer}/>
//         <form onSubmit={handleSubmit}>
   
//     <table>
// cutomers.map((current)  (
//     updateState===current.id ? <EditCustomer current={current} customer={customer} setCustomer={setCustomer}/>
// <tr>
//  <td> {customer.customerName} </td> 
//     <td> {customer.email} </td>
//     <td>     
        
//         <button className="edit" onClick={()=>handleEdit(current.id)}>Edit</button>
//         <button className="delete" type="button" onClick={()=>handleDelete(current.id)}>Delete</button>
//     </td>
// </tr>

// ))
// </table>
// </form>
// </div>
// </div>
//  )
 

//  function handleEdit(id){
//     const newList=customer.filter((li)=>li.id!==id)
// setCustomer(newList)
//  }

//  function handleDelete(id){
//     setUpdateState(id)

//  }
//  function handleSubmit(event){
//     event.preventDefault();
//     const customerName=event.target.elements.customerName.value
//     const email=event.target.elements.email.value
//     const newList=customer.map((li)=>(
//         li.id===updateState ?{li,customerName:customerName ,email:email}: li
//         ))
//         setCustomer(newList)
//         setUpdateState(-1)
        
//  }
// }
//  function EditCustomer({current,customer,setCustomer}) {
// function handInputCustomername(event){

// const value=event.target.value
// const newList=customer.map((li)=>(
// li.id===current.id ?{li,customerName:value}: li
// ))
// setCustomer(newList)
// }

// function handInputEmail(event){
   
//     const value=event.target.value
//     const newList=customer.map((li)=>(
//     li.id===current.id ?{li,email:value}: li
//     ))
//     setCustomer(newList)
//     }



// return(
// <tr>
//     <td>
//     <input type="text" onChange={handInputCustomername} name="customerName" value={current.customerName}/></td>
//            <td> <input type="text" onChange={handInputEmail}  name="email" value={current.email}/> </td>
//     <td> <button type="submit" >upadte</button>
//     </td>
// </tr>
// )

//  }


//  function AddCustomer({setCustomer}) {
//   // const Parser = ({ itemsArray }) => {
//   //   let refs = useRef([]);

// const customerNameref=React.useRef();
// const emailref=React.useRef();
//     function handleSubmit(event){
//         event.preventDefault();
//         const customerName=event.target.elements.customerName.value
//         const email=event.target.elements.email.value
// const newList={
//     id:3,
//     customerName,
//     email
// }
// setCustomer((prevList)=>{
//     return prevList.concat(newList);
// })
// //customerNameref.current.value=React.useRef()
// //emailref.current.value=React.useRef()
//             }
//     return (
//         <div>
//           <form className="addform" onSubmit={handleSubmit}>
//             <input type="text" name="customerName" placeholder="Enter your name" ref="customerNameref"/>
//             <input type="text" name="email" placeholder="Enter your email" ref="emailref"/>
           
//            <button type="submit" >Submit</button>
           
            
            
//           </form>




          
//         </div>
//     );
//   }


 

export default  Customer;
  
