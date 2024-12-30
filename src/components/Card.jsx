import React from "react";

const Card = ({ title, description, children }) => {
  return (
    <div className="card mb-3">
      <div className="card-body">
        {children && <div className="card-content">{children}</div>}
        <h2 className="card-title">{title}</h2>
        <p className="card-text">{description}</p>
      </div>
    </div>
  );
};

export default Card;
