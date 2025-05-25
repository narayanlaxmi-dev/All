import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useParams,useNavigate } from "react-router";

const UpdateProduct = () => {
   const {id}  = useParams();
  const [name,setName] = useState()
    const [desc,setDesc] = useState()
    const [cat,setCat] = useState()
    const [price,setPrice] = useState()

    const navigate = useNavigate()

  const fetchProducts = async() =>{
    const res = await axios.get("http://localhost:3001/product/"+id)
  
    setName(res.data.name);
    setDesc(res.data.name);

    setCat(res.data.name);

    setPrice(res.data.price);

  }

    useEffect(() =>{
      fetchProducts()
    },[])


    const handlePost = async() =>{
        await axios.put("http://localhost:3001/product/"+id,{
            name,
            price,
            category:cat,
            desc
        })
    }


    const handleSubmit = () =>{
        if(!name || !price || !cat || !desc)
            return;
        handlePost();
        navigate("/")
    }


  return (
    <div className="w-full">
  <div className="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4">
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="name">
        Name
      </label>
      <input value={name||""} onChange={e=>setName(e.target.value)} className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="name" type="text" placeholder="name"/>
    </div>
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="desc">
        Description
      </label>
      <input value={desc||""} onChange={e=>setDesc(e.target.value)}  className="shadow appearance-none border  rounded w-full py-2 px-3 text-gray-700  leading-tight focus:outline-none focus:shadow-outline" id="desc" type="text" placeholder="Description"/>
    </div>
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="category">
        Category
      </label>
      <input value={cat ||""} onChange={e=>setCat(e.target.value)}  className="shadow appearance-none border  rounded w-full py-2 px-3 text-gray-700  leading-tight focus:outline-none focus:shadow-outline" id="category" type="text" placeholder="Category"/>
    </div>
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="price">
        Price
      </label>
      <input value={price ||""} onChange={e=>setPrice(e.target.value)}  className="shadow appearance-none border  rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="price" type="text" placeholder="Price"/>
    </div>
    <div className="flex gap-20 items-center justify-center">
      <button className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="button" onClick={handleSubmit}>
        Update Product
      </button>
      <button className="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="button" onClick={()=>navigate("/")}>
        Cancle
      </button>
    </div>
  </div>
</div>
  )
}

export default UpdateProduct