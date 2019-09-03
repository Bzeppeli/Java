package WebProject.FirstProject.tomcat.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import WebProject.FirstProject.tomcat.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public ModelAndView cliente() {
		return new ModelAndView("cliente", "command", new Cliente());
	}
	
	@RequestMapping(value = "/addcliente", method = RequestMethod.POST)
	public String adicionarCliente(
		@ModelAttribute("SpringWeb") Cliente cliente, ModelMap model, HttpServletRequest request) {
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			model.addAttribute("nome", cliente.getNome());
			model.addAttribute("cpf", cliente.getCpf());
			model.addAttribute("descricao", cliente.getDescricao());
			model.addAttribute("telefone", cliente.getTelefone());
			model.addAttribute("endereco", cliente.getEndereco());
			model.addAttribute("rg", cliente.getRg());
			model.addAttribute("salario", cliente.getSalario());
			model.addAttribute("dataNascimento", cliente.getDataNascimento());
			model.addAttribute("profissao", cliente.getProfissao());
			
			List<Cliente> clientes = (List<Cliente>) request.getSession().getAttribute("clientes");
			if(clientes == null) {
				clientes = new ArrayList<Cliente>();
			}
			clientes.add(cliente);
			request.getSession().setAttribute("clientes", clientes);
			
			return "exibeCliente";
		}
	
			
		@RequestMapping(value = "/listaClientes", method = RequestMethod.GET)
		public String listarClientes( 
	   @ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {
			List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");
			
			model.addAttribute("clientes", clientes);
			
			
			return "listaClientes";
		}
	
	}
	
