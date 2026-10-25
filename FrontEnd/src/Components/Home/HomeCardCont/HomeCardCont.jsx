import React from 'react'

import './HomeCardCont.css'
import Card from '../../Card/Card'

export default function HomeCard() {
    return (
        <>
            <div className="container">
                <div className="topCollectionCont">
                    <div className="topCollContHeader">
                        <h3>Top Collections</h3>
                        <a href="">View all</a>
                    </div>

                    <div className="cardCont">
                        <Card />
                        <Card />
                        <Card />
                        <Card />
                    </div>
                </div>

                <hr />
                <div className="topSellerCont">
                    <div className="topSellContHeader">
                        <h3>Top Sellers</h3>
                        <a href="">View all</a>
                    </div>
                    <div className="cardCont">
                        <Card />
                        <Card />
                        <Card />
                        <Card />
                    </div>
                </div>
                <hr />
            </div>
        </>
    )
}
