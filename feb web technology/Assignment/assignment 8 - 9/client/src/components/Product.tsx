import React, { useEffect, useState } from 'react'
import axios from "axios"
import ProductCard from './ProductCard';

const Product = () => {
    const [products,setProducts] = useState();

    const[updateData,setUpdateData] = useState(false);


    const fetchProducts = async() =>{
       const data =  await axios.get("http://localhost:3001/product");
       setProducts(data.data)
    }

    useEffect(()=>{
        fetchProducts();
    },[updateData])

    

  return (
    <div className='flex gap-10 flex-wrap'>
        {products && products?.map(result => <ProductCard key={result._id} setUpdateData={setUpdateData} data={result}/>)}
    </div>
  )
}

export default Product