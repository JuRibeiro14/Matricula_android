package br.edu.fatecpg.com.duastelas.dao

import br.edu.fatecpg.com.duastelas.model.User

object UserDao {
        private var usuario: User? = null

        fun definirUsuario(user: User) {
            usuario = user
        }

        fun retornarUsuario(): User? {
            return usuario
        }
}