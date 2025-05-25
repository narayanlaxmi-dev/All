import React from 'react'
import { Link } from 'react-router'

const Header = () => {
  return (
    <div className='p-5 border-2 rounded-2xl'>
   <ul className="flex">
  <li className="mr-6">
    <Link to="/" >Home</Link>
  </li>
  <li className="mr-6">
    <Link to="/add">Add</Link>
  </li>
</ul>
    </div>
  )
}

export default Header