const Pool = require('pg').Pool
const config = require('./config.json')
const pool = new Pool({
  user: config.Postgre.user,
  host: config.Postgre.host,
  database: config.Postgre.database,
  password: config.Postgre.password,
  port: config.Postgre.port,
})
const getHelloWordString = (request, response) => {
  pool.query('SELECT * FROM hello FETCH FIRST ROW ONLY', (error, results) => {
    if (error) {
      response.status(500).json({ message: "Something went wrong when retrieving data from db" })
    } else {
      var helloWord = results.rows[0].Name;
      response.status(200).json(helloWord)
    }

  })
}
module.exports = {
  getHelloWordString
}