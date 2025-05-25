import axios from 'axios'
import React, { useState } from 'react'

const AddProduct = () => {

    const [name,setName] = useState()
    const [desc,setDesc] = useState()
    const [cat,setCat] = useState()
    const [price,setPrice] = useState()


    const handlePost = async() =>{
        await axios.post("http://localhost:3001/product",{
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
    }


  return (
    <div className="w-full">
  <div className="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4">
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" for="username">
        Name
      </label>
      <input value={name} onChange={e=>setName(e.target.value)} className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="username" type="text" placeholder="name"/>
    </div>
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" for="password">
        Description
      </label>
      <input value={desc} onChange={e=>setDesc(e.target.value)}  className="shadow appearance-none border  rounded w-full py-2 px-3 text-gray-700  leading-tight focus:outline-none focus:shadow-outline" id="text" type="password" placeholder="Description"/>
    </div>
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" for="password">
        Category
      </label>
      <input value={cat} onChange={e=>setCat(e.target.value)}  className="shadow appearance-none border  rounded w-full py-2 px-3 text-gray-700  leading-tight focus:outline-none focus:shadow-outline" id="text" type="password" placeholder="Category"/>
    </div>
    <div className="mb-4">
      <label className="block text-gray-700 text-sm font-bold mb-2" for="password">
        Price
      </label>
      <input value={price} onChange={e=>setPrice(e.target.value)}  className="shadow appearance-none border  rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="text" type="password" placeholder="Price"/>
    </div>
    <div className="flex items-center justify-center">
      <button className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="button" onClick={handleSubmit}>
        Add Product
      </button>
    </div>
  </div>
</div>
  )
}

export default AddProduct