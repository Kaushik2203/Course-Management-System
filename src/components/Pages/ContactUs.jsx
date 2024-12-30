import React from "react";
import Card from "../Card";

//import "./Contact.css"; // Create a CSS file for any additional custom styling

const ContactUs = () => {
  return (
    <div className="container mt-5">
      <Card
        description="We'd love to hear from you! Please fill out the form below to get in touch with our team."
        title="Get in Touch"
      >
        <h1>Contact Us</h1>
        <form className="contact-form">
          <div className="mb-3">
            <label className="form-label" htmlFor="name">
              Name
            </label>
            <input type="text" className="form-control" id="name" />
          </div>
          <div className="mb-3">
            <label className="form-label" htmlFor="email">
              Email
            </label>
            <input type="email" className="form-control" id="email" />
          </div>
          <div className="mb-3">
            <label className="form-label" htmlFor="message">
              Message
            </label>
            <textarea className="form-control" id="message" rows="4"></textarea>
          </div>
          <button type="submit" className="btn btn-primary">
            Send Message
          </button>
        </form>
      </Card>
      <div className="mt-4">
        <Card title="Our Office">
          <p>Course Management System HQ</p>
          <p>123 Learning Lane, Education City, 45678</p>
          <p>Phone: +123 456 7890</p>
          <p>Email: support@cms.com</p>
        </Card>
      </div>
    </div>
  );
};

export default ContactUs;
