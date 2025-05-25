import React from "react";

class ErrorBoundary extends React.Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false }; // false : no error
  }

  static getDerivedStateFromError(error) {
    // if error true

    return { hasError: true };
  }

  componentDidCatch(error, errorInfo) {
    // You can also log the error to an error reporting service
    console.log(error, errorInfo);
  }

  render() {
    if (this.state.hasError) {
      // You can render any custom fallback UI
      return <h1>Image Is Empty.</h1>;
    }

    return this.props.children;
  }
}
export default ErrorBoundary;
