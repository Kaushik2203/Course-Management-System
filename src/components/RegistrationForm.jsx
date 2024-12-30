import React from "react";
import "./RegistrationForm.css";
const RegistrationForm = () => {
  return (
    <div class="container">
      <form class="form-container">
        <div id="head">
          <h3>User Registration</h3>
        </div>
        <div class="col-md-12">
          <label for="inputUsername" class="form-label">
            Username
          </label>
          <input type="text" class="form-control" id="inputUsername" required />
        </div>

        <div class="col-md-12">
          <label for="inputEmail" class="form-label">
            Email
          </label>
          <input type="email" class="form-control" id="inputEmail" required />
        </div>

        <div class="col-12">
          <label class="form-label">Role</label>

          <div class="form-check">
            <input
              class="form-check-input"
              type="radio"
              name="role"
              id="roleAdmin"
              value="Admin"
              required
              disabled
            />
            <label class="form-check-label" for="roleAdmin">
              {" "}
              Admin{" "}
            </label>
          </div>

          <div class="form-check">
            <input
              class="form-check-input"
              type="radio"
              name="role"
              id="roleStudent"
              value="Student"
              required
            />
            <label class="form-check-label" for="roleStudent">
              {" "}
              Student{" "}
            </label>
          </div>

          <div class="form-check">
            <input
              class="form-check-input"
              type="radio"
              name="role"
              id="roleInstructor"
              value="Instructor"
              required
            />
            <label class="form-check-label" for="roleInstructor">
              Instructor
            </label>
          </div>
          <div class="invalid-feedback">Please select a role.</div>
        </div>

        <div class="col-12">
          <label for="inputPassword" class="form-label">
            Password
          </label>
          <input
            type="password"
            class="form-control"
            id="inputPassword"
            placeholder="Enter your password"
            required
          />
        </div>

        <div class="col-12">
          <label for="inputConfirmPassword" class="form-label">
            Confirm Password
          </label>
          <input
            type="password"
            class="form-control"
            id="inputConfirmPassword"
            placeholder="Enter Confirm password"
            required
          />
        </div>

        <div class="col-12 button-container">
          <button type="submit" class="btn btn-primary">
            Sign in
          </button>
        </div>

        <div id="already">
          <span>
            Already a User ?<a href="login.html">Login</a>
          </span>
        </div>
      </form>
    </div>
  );
};

export default RegistrationForm;
