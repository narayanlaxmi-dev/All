import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import RouterProvider from './components/RouterProvider.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <RouterProvider>
    <App />
    </RouterProvider>
  </StrictMode>,
)
