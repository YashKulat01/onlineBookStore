
import { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import { banners } from "./banner";
import "./HomeBanner.css";

function HomeBanner() {
    const [current, setCurrent] = useState(0);

    useEffect(() => {
        const timer = setInterval(() => {
            setCurrent((prev) => (prev + 1) % banners.length);
        }, 6000);

        return () => clearInterval(timer);
    }, []);

    const banner = banners[current];

    return (
        <>
            <section className="hero-banner">
                <div className="hero-content" key={current}>
                    <span className="hero-badge">{banner.badge}</span>

                    <h1>
                        {banner.title}<br />
                        <span>{banner.highlight}</span>
                    </h1>

                    <p>{banner.description}</p>

                    <div className="hero-buttons">
                        <Link to={banner.link} className="hero-btn primary-btn">
                            {banner.button}
                        </Link>

                        <Link to="/categories" className="hero-btn secondary-btn">
                            Explore Categories
                        </Link>
                    </div>
                </div>

                <div className="hero-image" key={`image-${current}`}>
                    <img src={banner.image} alt={banner.alt} />
                </div>

                {/* Slider dots */}
                <div className="slider-dots">
                    {banners.map((item, index) => (
                        <button key={item.badge} type="button"
                            className={`slider-dot ${current === index ? "active" : ""}`}
                            onClick={() => setCurrent(index)} aria-label={`Go to banner ${index + 1}`}
                            aria-current={current === index ? "true" : undefined}/>
                    ))}
                </div>
            </section>

            {/* Benefits section */}
            <section className="benefits-section">
                <div className="benefit-item">
                    <div>
                        <h3>Free Shipping</h3>
                        <p>On orders above ₹499</p>
                    </div>
                </div>

                <div className="benefit-item">
                    <div>
                        <h3>Secure Payment</h3>
                        <p>Safe and secure checkout</p>
                    </div>
                </div>

                <div className="benefit-item">
                    <div>
                        <h3>24/7 Support</h3>
                        <p>We're here to help</p>
                    </div>
                </div>

                <div className="benefit-item">
                    <div>
                        <h3>Easy Returns</h3>
                        <p>Hassle-free returns</p>
                    </div>
                </div>
            </section>
        </>
    );
}

export default HomeBanner;
