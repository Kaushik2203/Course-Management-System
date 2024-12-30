import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import { Route, Routes } from "react-router-dom";
import Home from "./components/Pages/Home";
import Login from "./components/Pages/Login";
import Signup from "./components/Pages/Signup";
import Navbar from "./components/Navbar";
import AboutUs from "./components/Pages/AboutUs";
import ContactUs from "./components/Pages/ContactUs";

function App() {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />}></Route>
        <Route path="/login" element={<Login />}></Route>
        <Route path="/register" element={<Signup />}></Route>
        <Route path="/aboutus" element={<AboutUs />}></Route>
        <Route path="/contact" element={<ContactUs />}></Route>
      </Routes>
    </div>
  );
}

export default App;
