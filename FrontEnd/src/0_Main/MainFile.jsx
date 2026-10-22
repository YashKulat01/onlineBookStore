import React from 'react'
import { RouterProvider } from 'react-router-dom'
import { routes } from '../Routes/Routes'

export default function MainFile() {
    return (
        <>
            <RouterProvider router={routes} />
        </>
    )
}
