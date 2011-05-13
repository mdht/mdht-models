/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Internal Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.InternalReference#validateInternalReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.InternalReference#validateInternalReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.InternalReference#validateInternalReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalReferenceOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInternalReferenceTemplateId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInternalReferenceTemplateId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.4.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInternalReferenceTemplateId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInternalReferenceTemplateId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.4.1')
	 * @param internalReference The receiving '<em><b>Internal Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateInternalReferenceTemplateId(InternalReference internalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
  		
       
      	
		if (VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.INTERNAL_REFERENCE);
			try {
				
					VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);				
				
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		
			if (!EOCL_ENV.createQuery(VALIDATE_INTERNAL_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(internalReference)) {
				if (diagnostics != null) {
					
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.INTERNAL_REFERENCE__INTERNAL_REFERENCE_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("InternalReferenceTemplateId"),
						 new Object [] { internalReference }));
				}
			return false;
		}		
				
		
		
		
		
      	
		
		return true;
		
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInternalReferenceCode(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInternalReferenceCode(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInternalReferenceCode(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInternalReferenceCode(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param internalReference The receiving '<em><b>Internal Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateInternalReferenceCode(InternalReference internalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
  		
       
      	
		if (VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.INTERNAL_REFERENCE);
			try {
				
					VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);				
				
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		
			if (!EOCL_ENV.createQuery(VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(internalReference)) {
				if (diagnostics != null) {
					
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.INTERNAL_REFERENCE__INTERNAL_REFERENCE_CODE,
						 IHEPlugin.INSTANCE.getString("InternalReferenceCode"),
						 new Object [] { internalReference }));
				}
			return false;
		}		
				
		
		
		
		
      	
		
		return true;
		
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInternalReferenceId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInternalReferenceId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateInternalReferenceId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInternalReferenceId(InternalReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param internalReference The receiving '<em><b>Internal Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateInternalReferenceId(InternalReference internalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
  		
       
      	
		if (VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.INTERNAL_REFERENCE);
			try {
				
					VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);				
				
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		
			if (!EOCL_ENV.createQuery(VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(internalReference)) {
				if (diagnostics != null) {
					
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.INTERNAL_REFERENCE__INTERNAL_REFERENCE_ID,
						 IHEPlugin.INSTANCE.getString("InternalReferenceId"),
						 new Object [] { internalReference }));
				}
			return false;
		}		
				
		
		
		
		
      	
		
		return true;
		
	}

} // InternalReferenceOperations