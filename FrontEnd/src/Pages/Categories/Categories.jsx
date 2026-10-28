import React from 'react'
import '../Categories/Categories.css';
import Sidebar from '../../Components/Categories/SideBar/SideBar';

export default function Categories() {
  return (
    <>
        <div className="main">
            {/* Side bar container */}
            <div className="sidbarCont">
                <Sidebar/>
            </div>

            {/* Category container */}
            <div className="categoryCont">
                this is category container
            </div>
        </div>
    </>
  )
}
