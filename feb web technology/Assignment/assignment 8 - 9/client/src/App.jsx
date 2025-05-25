import React from 'react'
import { Outlet } from 'react-router'
import Header from './components/Header'
import Footer from './components/Footer'

const App = () => {
  return (
    <div className='flex flex-col justify-between h-screen p-5'>
      <div className='space-y-10'>
      <Header/>
      <Outlet/>
      </div>
      <Footer/>
    </div>
  )
}

export default App