import { createBrowserRouter } from "react-router-dom";
import Layout from "../Layout/Layout";
import Home from "../Pages/Home/Home";
import Categories from "../Pages/Categories/Categories";


export const routes = createBrowserRouter([
    {
        path: "",
        element: <Layout />,
        children: [
            { path: "/", element: <Home /> },

            { path: "/categories", element: <Categories /> },
        ]
    }
]);