/**
 */
package org.hl7.security.ds4p.contentprofile.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.EntryRelationshipOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPlugin;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Annotation Entry Relationship</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship#validatePrivacyAnnotationEntryRelationshipTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship#validatePrivacyAnnotationEntryRelationshipOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivacyAnnotationEntryRelationshipOperations extends EntryRelationshipOperations {

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
	protected PrivacyAnnotationEntryRelationshipOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationEntryRelationshipTemplateId(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationEntryRelationshipTemplateId(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.3251.1.11')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationEntryRelationshipTemplateId(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationEntryRelationshipTemplateId(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotationEntryRelationship The receiving '<em><b>Privacy Annotation Entry Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyAnnotationEntryRelationshipTemplateId(
			PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PrivacyAnnotationEntryRelationshipPrivacyAnnotationEntryRelationshipTemplateId", "ERROR");

		if (VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP);
			try {
				VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyAnnotationEntryRelationship)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PrivacyAnnotationEntryRelationshipPrivacyAnnotationEntryRelationshipTemplateId"),
						new Object[] { privacyAnnotationEntryRelationship }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrivacyAnnotationEntryRelationshipOrganizer(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationEntryRelationshipOrganizer(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.organizer->one(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(contentprofile::PrivacyAnnotation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrivacyAnnotationEntryRelationshipOrganizer(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Entry Relationship Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrivacyAnnotationEntryRelationshipOrganizer(PrivacyAnnotationEntryRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param privacyAnnotationEntryRelationship The receiving '<em><b>Privacy Annotation Entry Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrivacyAnnotationEntryRelationshipOrganizer(
			PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PrivacyAnnotationEntryRelationshipPrivacyAnnotationEntryRelationshipOrganizer", "ERROR");

		if (VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONTENTPROFILEPackage.Literals.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP);
			try {
				VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				privacyAnnotationEntryRelationship)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONTENTPROFILEValidator.DIAGNOSTIC_SOURCE,
						CONTENTPROFILEValidator.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER,
						CONTENTPROFILEPlugin.INSTANCE.getString(
							"PrivacyAnnotationEntryRelationshipPrivacyAnnotationEntryRelationshipOrganizer"),
						new Object[] { privacyAnnotationEntryRelationship }));
			}

			return false;
		}
		return true;
	}

} // PrivacyAnnotationEntryRelationshipOperations
