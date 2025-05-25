import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router'

const ProductCard = ({data,setUpdateData}) => {

    const [id,setId] = useState()
    const navigate = useNavigate()
    const [confirm,setconfirm] = useState(false)
    const[delete1,setDelete1] = useState(false);
     const handleDelete = async() =>{
            await axios.delete("http://localhost:3001/product/"+id)
            setUpdateData(true)
        }

useEffect(()=>{
    if(confirm && id){
handleDelete()
    }
},[confirm])

console.log(confirm)

    
  return (
    <div className="grow-1 max-w-sm rounded overflow-hidden shadow-lg relative">
       {delete1 && <Popup setconfirm={setconfirm} setDelete1={setDelete1} />}
  <img className="w-full" src="data:image/png;base64,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" alt="Sunset in the mountains"/>
  <div className="px-6 py-4">
    <div className="font-bold text-xl mb-2">{data.name}</div>
    <p className="text-gray-700 text-base">
      {data.desc}   </p>
      <p>{data.price}</p>
  </div>
    <span className="ml-5 inline-block bg-gray-200 rounded-full px-3 py-1 text-sm font-semibold text-gray-700 mr-2 mb-2">{data.category}</span>
 
  <div className='flex justify-between px-10 my-5'>
  <button onClick={()=>navigate("/update/"+data._id)} className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded cursor-pointer">Update</button>
  <button onClick={() =>{setDelete1(true);setId(data._id)}} className="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded cursor-pointer">Delete</button>
  </div>
</div>
  )
}


const Popup = ({setconfirm,setDelete1}) =>{
    return(

        <div className='absolute bg-white w-full bottom-0 h-32 rounded-t-2xl  flex justify-between items-end px-10 py-5'>
<button className='cursor-pointer bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded ' onClick={()=>{setconfirm(true)
    setDelete1(false)}
}>Yes</button>
<button className='bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded cursor-pointer' onClick={()=>{setconfirm(false); setDelete1(false);setId()}}>No</button>
    </div>
    )
}

export default ProductCard