import React from 'react'

import NavBar from '../Components/NavBar/NavBar.jsx'
import { Outlet } from 'react-router-dom'
import Footer from '../Components/Footer/Footer.jsx'

export default function Layout() {
    return (
        <>
            <NavBar />
            <Outlet />
            <Footer />
        </>
    )
}
