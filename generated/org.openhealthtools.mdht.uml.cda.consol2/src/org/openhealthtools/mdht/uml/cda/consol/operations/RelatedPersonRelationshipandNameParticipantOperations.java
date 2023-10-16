/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.Participant1Operations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Related Person Relationshipand Name Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedPersonRelationshipandNameParticipantOperations extends Participant1Operations {

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
	protected RelatedPersonRelationshipandNameParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantTemplateId(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantTemplateId(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.5.8' and id.extension = '2023-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantTemplateId(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantTemplateId(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param relatedPersonRelationshipandNameParticipant The receiving '<em><b>Related Person Relationshipand Name Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRelatedPersonRelationshipandNameParticipantTemplateId(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantTemplateId",
			"null");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				relatedPersonRelationshipandNameParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										relatedPersonRelationshipandNameParticipant, context) }),
						new Object[] { relatedPersonRelationshipandNameParticipant }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantTypeCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantTypeCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantTypeCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantTypeCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param relatedPersonRelationshipandNameParticipant The receiving '<em><b>Related Person Relationshipand Name Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRelatedPersonRelationshipandNameParticipantTypeCode(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantTypeCode",
			"null");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				relatedPersonRelationshipandNameParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantTypeCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										relatedPersonRelationshipandNameParticipant, context) }),
						new Object[] { relatedPersonRelationshipandNameParticipant }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param relatedPersonRelationshipandNameParticipant The receiving '<em><b>Related Person Relationshipand Name Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntity(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntity",
			"null");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				relatedPersonRelationshipandNameParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntity",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										relatedPersonRelationshipandNameParticipant, context) }),
						new Object[] { relatedPersonRelationshipandNameParticipant }));
			}

			return false;
		}
		return true;
	}

} // RelatedPersonRelationshipandNameParticipantOperations
