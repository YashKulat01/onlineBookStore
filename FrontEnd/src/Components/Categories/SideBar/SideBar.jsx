import React, { useEffect, useState } from "react";
import "./Sidebar.css";

const categories = [
  "Fiction",
  "Non Fiction",
  "Self Help",
  "Science Fiction",
  "Biography",
  "Children",
  "Business",
  "Technology",
];

const priceRanges = [
  { label: "₹0 – ₹200", min: 0, max: 200 },
  { label: "₹200 – ₹400", min: 200, max: 400 },
  { label: "₹400 – ₹600", min: 400, max: 600 },
  { label: "₹600 – ₹1000", min: 600, max: 1000 },
];

const ratings = [4, 3, 2, 1];

export default function Sidebar({ onFiltersChange }) {
  const [selectedCategories, setSelectedCategories] = useState([]);
  const [selectedPrices, setSelectedPrices] = useState([]);
  const [selectedRating, setSelectedRating] = useState(null);
  const [availability, setAvailability] = useState([]);
  const [maxPrice, setMaxPrice] = useState(1000);

  useEffect(() => {
    onFiltersChange?.({
      categories: selectedCategories,
      priceRanges: selectedPrices,
      rating: selectedRating,
      availability,
      maxPrice,
    });
  }, [
    selectedCategories,
    selectedPrices,
    selectedRating,
    availability,
    maxPrice,
    onFiltersChange,
  ]);

  const toggleItem = (value, list, setList) => {
    setList(
      list.includes(value)
        ? list.filter((item) => item !== value)
        : [...list, value]
    );
  };

  return (
    <aside className="category-sidebar">
      <div className="sidebar-heading">
        <h2>Categories</h2>
      </div>

      <div className="filter-section">
        {categories.map((category) => (
          <label className="filter-option" key={category}>
            <input
              type="checkbox"
              checked={selectedCategories.includes(category)}
              onChange={() =>
                toggleItem(
                  category,
                  selectedCategories,
                  setSelectedCategories
                )
              }
            />
            <span>{category}</span>
          </label>
        ))}
      </div>

      <div className="filter-divider" />

      <div className="filter-section">
        <h3>Price Range</h3>

        {priceRanges.map((range) => (
          <label className="filter-option" key={range.label}>
            <input
              type="checkbox"
              checked={selectedPrices.includes(range.label)}
              onChange={() =>
                toggleItem(
                  range.label,
                  selectedPrices,
                  setSelectedPrices
                )
              }
            />
            <span>{range.label}</span>
          </label>
        ))}

        {/* <div className="price-slider">
          <input
            type="range"
            min="0"
            max="1000"
            step="50"
            value={maxPrice}
            onChange={(e) => setMaxPrice(Number(e.target.value))}
          />

          <div className="price-labels">
            <span>₹0</span>
            <span>₹{maxPrice}</span>
          </div>
        </div> */}
      </div>

      <div className="filter-divider" />

      <div className="filter-section">
        <h4>Ratings</h4>

        {ratings.map((rating) => (
          <label className="filter-option" key={rating}>
            <input
              type="checkbox"
              checked={selectedRating === rating}
              onChange={() =>
                setSelectedRating(
                  selectedRating === rating ? null : rating
                )
              }
            />

            <span>
              {rating} ★ & above
            </span>
          </label>
        ))}
      </div>

      <div className="filter-divider" />

      <div className="filter-section">
        <h4>Availability</h4>

        {["In Stock", "Out of Stock"].map((item) => (
          <label className="filter-option" key={item}>
            <input
              type="checkbox"
              checked={availability.includes(item)}
              onChange={() =>
                toggleItem(item, availability, setAvailability)
              }
            />
            <span>{item}</span>
          </label>
        ))}
      </div>

      <button
        className="clear-filters"
        onClick={() => {
          setSelectedCategories([]);
          setSelectedPrices([]);
          setSelectedRating(null);
          setAvailability([]);
          setMaxPrice(1000);
        }}
      >
        Clear All Filters
      </button>
    </aside>
  );
}