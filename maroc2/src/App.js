import React from "react";
import Navbar from "./components/Navbar";
import Header from "./components/Header";
import Feature from "./components/Villes";
import About from "./components/About";
import Contact from "./components/Contact";
import HotelSearch from "./components/HotelSearch";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Login from "./components/Login";
function App() {
  return (
    <div className="App">
      {/* <Router> */}
     {/* <Link to={"/searchH"} className="nav-link">
                 serach
                </Link> */}
      <Navbar/>
      <Header/>
      <Feature/>
      <About/>
      <Contact/>
      <Login/>
   {/*   <Route>
      <Route path="/searchH" element={<HotelSearch />} />
      </Route>
              </Router>*/}
      
    </div>
  );
}

export default App;
