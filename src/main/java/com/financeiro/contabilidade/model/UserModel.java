/*
 * 
 * package com.financeiro.contabilidade.model;
 * 
 * import java.util.Collection;
 * import java.util.List;
 * import java.util.UUID;
 * 
 * import javax.persistence.Column;
 * import javax.persistence.Entity;
 * import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType;
 * import javax.persistence.Id;
 * import javax.persistence.JoinColumn;
 * import javax.persistence.JoinTable;
 * import javax.persistence.ManyToMany;
 * import javax.persistence.Table;
 * 
 * import org.springframework.security.core.GrantedAuthority;
 * import org.springframework.security.core.userdetails.UserDetails;
 * 
 * @Entity
 * 
 * @Table(name = "tb_user")
 * public class UserModel implements UserDetails {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * private UUID id;
 * 
 * @Column(nullable = false, unique = true)
 * private String username;
 * 
 * @Column(nullable = false)
 * private String password;
 * 
 * @ManyToMany
 * 
 * @JoinTable(name = "tb_users_roles", joinColumns = @JoinColumn(name =
 * "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
 * private List<RoleModel> roles;
 * 
 * @Override
 * public Collection<? extends GrantedAuthority> getAuthorities() {
 * return this.roles;
 * }
 * 
 * public UUID getId() {
 * return id;
 * }
 * 
 * public void setId(UUID id) {
 * this.id = id;
 * }
 * 
 * @Override
 * public String getPassword() {
 * return password;
 * }
 * 
 * public void setPassword(String password) {
 * this.password = password;
 * }
 * 
 * @Override
 * public String getUsername() {
 * return username;
 * }
 * 
 * public void setUsername(String username) {
 * this.username = username;
 * }
 * 
 * @Override
 * public boolean isAccountNonExpired() {
 * return true;
 * }
 * 
 * @Override
 * public boolean isAccountNonLocked() {
 * return true;
 * }
 * 
 * @Override
 * public boolean isCredentialsNonExpired() {
 * return true;
 * }
 * 
 * @Override
 * public boolean isEnabled() {
 * return true;
 * }
 * }
 * 
 */