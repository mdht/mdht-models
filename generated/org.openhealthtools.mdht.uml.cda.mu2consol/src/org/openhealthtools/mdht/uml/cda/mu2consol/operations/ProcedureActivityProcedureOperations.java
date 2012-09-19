/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure#validateMu2consolProcedureActivityProcedureCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure#validateMu2consolProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityProcedureOperations extends org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityProcedureOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolProcedureActivityProcedureCodeValue(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolProcedureActivityProcedureCodeValue(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.96' xor self.code.codeSystem = '2.16.840.1.113883.6.12'";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolProcedureActivityProcedureCodeValue(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolProcedureActivityProcedureCodeValue(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.96' xor self.code.codeSystem = '2.16.840.1.113883.6.12'
	 * @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMu2consolProcedureActivityProcedureCodeValue(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.PROCEDURE_ACTIVITY_PROCEDURE__MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolProcedureActivityProcedureCodeValue"),
						 new Object [] { procedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMu2consolProcedureActivityProcedureCode(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMu2consolProcedureActivityProcedureCode(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.PROCEDURE_ACTIVITY_PROCEDURE__MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolProcedureActivityProcedureCode"),
						 new Object [] { procedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.14')
	 * @param procedureActivityProcedure The receiving '<em><b>Procedure Activity Procedure</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivityProcedure)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProcedureActivityProcedureTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(procedureActivityProcedure, context) }),
						 new Object [] { procedureActivityProcedure }));
			}
			 
			return false;
		}
		return true;
	}

} // ProcedureActivityProcedureOperations