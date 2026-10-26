import React from 'react'
import './Card.css';
export default function Card() {
    return (
        <>
            <div class="card">
                <img src="https://images.unsplash.com/photo-1544947950-fa07a98d237f?w=500" class="card-img-top" alt="..." />
                <hr />
                <div class="card-body">
                    <h5 class="card-title">Atomic Habits</h5>
                    <p class="card-text">James green.</p>
                    <h5>Price</h5>
                    <h6>Rating</h6>
                </div>
            </div>
        </>
    )
}
