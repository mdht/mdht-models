/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.AssignedAuthorOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mandatory Document Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorTelecomEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Telecom Email</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Authoring Device</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor#validateMandatoryDocumentAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Represented Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryDocumentAssignedAuthorOperations extends AssignedAuthorOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryDocumentAssignedAuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentAssignedAuthorTemplateId(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorTemplateId(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentAssignedAuthorTemplateId(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorTemplateId(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentAssignedAuthor The receiving '<em><b>Mandatory Document Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryDocumentAssignedAuthorTemplateId(
			MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorTemplateId", "ERROR");

		if (VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				mandatoryDocumentAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorTemplateId"),
						new Object[] { mandatoryDocumentAssignedAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentAssignedAuthorTelecomEmail(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Telecom Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorTelecomEmail(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (( not self.telecom->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentAssignedAuthorTelecomEmail(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Telecom Email</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorTelecomEmail(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentAssignedAuthor The receiving '<em><b>Mandatory Document Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryDocumentAssignedAuthorTelecomEmail(
			MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorTelecomEmail", "ERROR");

		if (VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				mandatoryDocumentAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorTelecomEmail"),
						new Object[] { mandatoryDocumentAssignedAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Authoring Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthoringDevice->one(assignedAuthoringDevice : cda::AuthoringDevice | not assignedAuthoringDevice.oclIsUndefined() and assignedAuthoringDevice.oclIsKindOf(cda::AuthoringDevice))";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Authoring Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentAssignedAuthor The receiving '<em><b>Mandatory Document Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(
			MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorAssignedAuthoringDevice",
			"WARNING");

		if (VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				mandatoryDocumentAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorAssignedAuthoringDevice"),
						new Object[] { mandatoryDocumentAssignedAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentAssignedAuthorAssignedPerson(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorAssignedPerson(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentAssignedAuthorAssignedPerson(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorAssignedPerson(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentAssignedAuthor The receiving '<em><b>Mandatory Document Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryDocumentAssignedAuthorAssignedPerson(
			MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorAssignedPerson", "WARNING");

		if (VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				mandatoryDocumentAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorAssignedPerson"),
						new Object[] { mandatoryDocumentAssignedAuthor }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMandatoryDocumentAssignedAuthorRepresentedOrganization(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorRepresentedOrganization(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity))";

	/**
	 * The cached OCL invariant for the '{@link #validateMandatoryDocumentAssignedAuthorRepresentedOrganization(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mandatory Document Assigned Author Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMandatoryDocumentAssignedAuthorRepresentedOrganization(MandatoryDocumentAssignedAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mandatoryDocumentAssignedAuthor The receiving '<em><b>Mandatory Document Assigned Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMandatoryDocumentAssignedAuthorRepresentedOrganization(
			MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorRepresentedOrganization",
			"WARNING");

		if (VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR);
			try {
				VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				mandatoryDocumentAssignedAuthor)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"MandatoryDocumentAssignedAuthorMandatoryDocumentAssignedAuthorRepresentedOrganization"),
						new Object[] { mandatoryDocumentAssignedAuthor }));
			}

			return false;
		}
		return true;
	}

} // MandatoryDocumentAssignedAuthorOperations
