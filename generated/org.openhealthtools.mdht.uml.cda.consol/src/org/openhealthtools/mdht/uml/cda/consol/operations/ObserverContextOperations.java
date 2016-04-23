/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.AuthorOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ObserverContext;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observer Context</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObserverContext#validateObserverContextTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObserverContext#validateObserverContextAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserverContextOperations extends AuthorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverContextOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObserverContextTemplateId(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObserverContextTemplateId(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateObserverContextTemplateId(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObserverContextTemplateId(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observerContext The receiving '<em><b>Observer Context</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObserverContextTemplateId(ObserverContext observerContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OBSERVER_CONTEXT);
			try {
				VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observerContext)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OBSERVER_CONTEXT__OBSERVER_CONTEXT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ObserverContextObserverContextTemplateId"),
						 new Object [] { observerContext }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObserverContextAssignedAuthor(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObserverContextAssignedAuthor(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))";

	/**
	 * The cached OCL invariant for the '{@link #validateObserverContextAssignedAuthor(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObserverContextAssignedAuthor(ObserverContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observerContext The receiving '<em><b>Observer Context</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateObserverContextAssignedAuthor(ObserverContext observerContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OBSERVER_CONTEXT);
			try {
				VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(observerContext)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.OBSERVER_CONTEXT__OBSERVER_CONTEXT_ASSIGNED_AUTHOR,
						 ConsolPlugin.INSTANCE.getString("ObserverContextObserverContextAssignedAuthor"),
						 new Object [] { observerContext }));
			}
			 
			return false;
		}
		return true;
	}

} // ObserverContextOperations
