/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.Participant1Operations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require State Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RelatedPersonRelationshipandNameParticipant#validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Associated Person</em>}</li>
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

	protected static ThreadLocal<Constraint> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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
			"ERROR");

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
						ConsolPlugin.INSTANCE.getString(
							"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantTemplateId"),
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

	protected static ThreadLocal<Constraint> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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
			"ERROR");

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
						ConsolPlugin.INSTANCE.getString(
							"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantTypeCode"),
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

	protected static ThreadLocal<Constraint> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

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
			"ERROR");

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
						ConsolPlugin.INSTANCE.getString(
							"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntity"),
						new Object[] { relatedPersonRelationshipandNameParticipant }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require State Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = 'US') implies state->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require State Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_STATE_ELEMENT,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequireStateElement"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() and country->exists(c : datatypes::ADXP | c.getText() = 'US') implies postalCode->size() >= 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address If Country Is Us Require Postal Code Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_IF_COUNTRY_IS_US_REQUIRE_POSTAL_CODE_ELEMENT,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressIfCountryIsUsRequirePostalCodeElement"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and " +
			"let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in " +
			"value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUse"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (( not use->isEmpty())  )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			"WARNING");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressUseP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (( not country->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			"WARNING");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCountry"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (( not state->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState",
			"WARNING");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressState"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressCity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (( not postalCode->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			"WARNING");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine->isEmpty()) ) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity General Header Constraints US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).associatedPerson->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject((getText(true)<>'' and ( family->isEmpty() and given->isEmpty() and suffix->isEmpty() and prefix->isEmpty()   )   ) xor (getText(true)='' and (not family->isEmpty() and not given->isEmpty()  )))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityCode(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityCode",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr",
			"WARNING");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom",
			"WARNING");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Person Relationshipand Name Participant Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(RelatedPersonRelationshipandNameParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

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

	@SuppressWarnings("unchecked")
	public static boolean validateRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson(
			RelatedPersonRelationshipandNameParticipant relatedPersonRelationshipandNameParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson",
			"ERROR");

		if (VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			relatedPersonRelationshipandNameParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT__RELATED_PERSON_RELATIONSHIPAND_NAME_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"RelatedPersonRelationshipandNameParticipantRelatedPersonRelationshipandNameParticipantAssociatedEntityAssociatedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // RelatedPersonRelationshipandNameParticipantOperations
