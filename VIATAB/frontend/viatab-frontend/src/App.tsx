import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [homeMessage, setHomeMessage] = useState('Loading home message...')
  const [aboutMessage, setAboutMessage] = useState('Loading about message...')
  const [error, setError] = useState('')

  useEffect(() => {
    fetch('http://localhost:8080/')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to fetch home endpoint')
        }
        return response.text()
      })
      .then((data) => setHomeMessage(data))
      .catch((err) => setError(err.message))

    fetch('http://localhost:8080/about')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to fetch about endpoint')
        }
        return response.text()
      })
      .then((data) => setAboutMessage(data))
      .catch((err) => setError(err.message))
  }, [])

  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial, sans-serif' }}>
      <h1>VIATAB Frontend</h1>
      <p>This frontend is connected to the Spring Boot backend.</p>

      <h2>Home Endpoint</h2>
      <p>{homeMessage}</p>

      <h2>About Endpoint</h2>
      <p>{aboutMessage}</p>

      {error && (
        <>
          <h2>Error</h2>
          <p>{error}</p>
        </>
      )}
    </div>
  )
}

export default App