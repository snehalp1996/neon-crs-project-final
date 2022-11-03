// import React, { useref,useState } from "react";
// //import './Curd.css'

// function Customer(){


//  const customer=[{id:1,customerName: "vaibhav", email: "vp"},
//  {id:2,customerName: "shruti", email: "sp "},
//  {id:3,customerName: "kartiki", email:" kp"}] ;


//  const [cutomers,setCustomer]=useState(customer)
//  const [updateState,setUpdateState]=useState(-1)

//  return(
// <div className="curd">
//     <div>
//         <AddCustomer setCustomer={setCustomer}/>
//         <form onSubmit={handleSubmit}>
   
//     <table>
// cutomers.map((current)  (
//     updateState===current.id ? <EditCustomer current={current} customer={cutomer} setCustomer={setCustomer}/>
// <tr>
// <td> {current.customerName} </td>
//     <td> {current.email} </td>
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
// const customerNameref=useref();
// const emailref=useref();
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
// customerNameref.current.value=""
// emailref.current.value=""
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


//  export default Customer;
