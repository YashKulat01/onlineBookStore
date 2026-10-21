import './Footer.css'

function SocialIcon({ label, children }) {
  return (
    <a href="#" aria-label={label}>
      {children}
    </a>
  )
}

export default function Footer() {
  return (
    <footer className="site-footer">
      <div className="footer-main">
        <div className="footer-brand">
          <a className="footer-logo" href="#" aria-label="Book Next home">
            <svg
              aria-hidden="true"
              viewBox="0 0 24 24"
              width="26"
              height="26"
              fill="none"
              stroke="currentColor"
              strokeWidth="1.8"
              strokeLinecap="round"
              strokeLinejoin="round"
            >
              <path d="M4 5.5A2.5 2.5 0 0 1 6.5 3H20v16H6.5A2.5 2.5 0 0 0 4 21.5z" />
              <path d="M4 5.5v16M8 7h8M8 11h8" />
            </svg>
            <span>Book <span className="brand-accent">Next</span></span>
          </a>
          <p>
            Find your next great read and make room for a new favorite.
          </p>
        </div>

        <nav className="footer-column" aria-label="Explore">
          <h3>Explore</h3>
          <a href="#">Home</a>
          <a href="#">Books</a>
          <a href="#">Categories</a>
          <a href="#">About us</a>
        </nav>

        <nav className="footer-column" aria-label="Customer care">
          <h3>Customer care</h3>
          <a href="#">Contact us</a>
          <a href="#">FAQs</a>
          <a href="#">Shipping</a>
          <a href="#">Returns</a>
        </nav>

        <div className="footer-column">
          <h3>Stay connected</h3>
          <p className="footer-connect-copy">
            Follow along for reading inspiration and bookstore updates.
          </p>
          <div className="social-links">
            <SocialIcon label="Instagram">
              <svg aria-hidden="true" viewBox="0 0 24 24" width="18" height="18" fill="none" stroke="currentColor" strokeWidth="1.8">
                <rect x="3" y="3" width="18" height="18" rx="5" />
                <circle cx="12" cy="12" r="4" />
                <circle cx="17.5" cy="6.5" r=".8" fill="currentColor" />
              </svg>
            </SocialIcon>
            <SocialIcon label="Facebook">
              <svg aria-hidden="true" viewBox="0 0 24 24" width="18" height="18" fill="currentColor">
                <path d="M13.5 21v-8h2.7l.4-3.1h-3.1v-2c0-.9.3-1.5 1.6-1.5h1.7V3.6c-.3 0-1.3-.1-2.4-.1-2.4 0-4.1 1.5-4.1 4.2v2.3H7.6v3.1h2.7v8z" />
              </svg>
            </SocialIcon>
            <SocialIcon label="X">
              <svg aria-hidden="true" viewBox="0 0 24 24" width="17" height="17" fill="currentColor">
                <path d="M18.9 3H21l-6.9 7.9L22.2 21h-6.3L11 14.8 5.6 21H3.5l7.4-8.5L3 3h6.5l4.4 5.8zm-1.1 16.2H19L8.2 4.7H6.9z" />
              </svg>
            </SocialIcon>
          </div>
        </div>
      </div>

      <div className="footer-bottom">
        <p>© {new Date().getFullYear()} Book Next. All rights reserved.</p>
        <div className="footer-legal">
          <a href="#">Privacy policy</a>
          <a href="#">Terms of service</a>
        </div>
      </div>
    </footer>
  )
}
