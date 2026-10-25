import React from 'react'

import './Home.css'
import HomeBanner from '../../Components/Home/HomeBanner/HomeBanner'
import HomeCard from '../../Components/Home/HomeCardCont/HomeCardCont'

export default function Home() {
    return (
        <>
            {/* Banner Section */}
            <div>
                <HomeBanner />
            </div>

            {/* Card Section */}
            <div className='cardSection'>
                <HomeCard />
            </div>
        </>
    )
}
