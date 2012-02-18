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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ServiceEventOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4PhysicianReadingStudyPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Physician Reading Study Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent4Operations extends ServiceEventOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent4ClassCode(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4ClassCode(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClassRoot::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent4ClassCode(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4ClassCode(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode') and self.classCode=vocab::ActClassRoot::ACT
	 * @param documentationOf_ServiceEvent4 The receiving '<em><b>Documentation Of Service Event4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent4ClassCode(DocumentationOf_ServiceEvent4 documentationOf_ServiceEvent4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT4);
			try {
				VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(documentationOf_ServiceEvent4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT4__SERVICE_EVENT4_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ServiceEvent4ClassCode"),
						 new Object [] { documentationOf_ServiceEvent4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent4Code(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4Code(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent4Code(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4Code(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param documentationOf_ServiceEvent4 The receiving '<em><b>Documentation Of Service Event4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent4Code(DocumentationOf_ServiceEvent4 documentationOf_ServiceEvent4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT4);
			try {
				VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(documentationOf_ServiceEvent4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT4__SERVICE_EVENT4_CODE,
						 ConsolPlugin.INSTANCE.getString("ServiceEvent4Code"),
						 new Object [] { documentationOf_ServiceEvent4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent4Id(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4Id(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent4Id(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4Id(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param documentationOf_ServiceEvent4 The receiving '<em><b>Documentation Of Service Event4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent4Id(DocumentationOf_ServiceEvent4 documentationOf_ServiceEvent4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT4);
			try {
				VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(documentationOf_ServiceEvent4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT4__SERVICE_EVENT4_ID,
						 ConsolPlugin.INSTANCE.getString("ServiceEvent4Id"),
						 new Object [] { documentationOf_ServiceEvent4 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceEvent4PhysicianReadingStudyPerformer(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Physician Reading Study Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4PhysicianReadingStudyPerformer(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer))";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceEvent4PhysicianReadingStudyPerformer(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Physician Reading Study Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceEvent4PhysicianReadingStudyPerformer(DocumentationOf_ServiceEvent4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(consol::PhysicianReadingStudyPerformer))
	 * @param documentationOf_ServiceEvent4 The receiving '<em><b>Documentation Of Service Event4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceEvent4PhysicianReadingStudyPerformer(
			DocumentationOf_ServiceEvent4 documentationOf_ServiceEvent4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT4);
			try {
				VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(documentationOf_ServiceEvent4)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DOCUMENTATION_OF_SERVICE_EVENT4__SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER,
						 ConsolPlugin.INSTANCE.getString("ServiceEvent4PhysicianReadingStudyPerformer"),
						 new Object [] { documentationOf_ServiceEvent4 }));
			}
			return false;
		}
		return true;
	}

} // DocumentationOf_ServiceEvent4Operations
