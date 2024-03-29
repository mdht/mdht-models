/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianofRecordParticipant2Operations extends PhysicianofRecordParticipantOperations {
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
	protected PhysicianofRecordParticipant2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipant2TemplateId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2TemplateId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipant2TemplateId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2TemplateId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianofRecordParticipant2TemplateId(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipant2PhysicianofRecordParticipant2TemplateId", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianofRecordParticipant2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianofRecordParticipant2PhysicianofRecordParticipant2TemplateId"),
						new Object[] { physicianofRecordParticipant2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null).assignedPerson->excluding(null).name->excluding(null)->select(isNullFlavorUndefined())->reject((getText(true)<>'' and ( family->isEmpty() and given->isEmpty() and suffix->isEmpty() and prefix->isEmpty()   )   ) xor (getText(true)='' and (not family->isEmpty() and not given->isEmpty()  )))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianofRecordParticipant2PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent",
			"ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipant2PhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null).representedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianofRecordParticipant2PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName",
			"WARNING");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipant2PhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipant2PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization",
			"INFO");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipant2PhysicianofRecordParticipant2AssignedEntityRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianofRecordParticipantAssignedEntity(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntity", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianofRecordParticipant2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntity"),
						new Object[] { physicianofRecordParticipant2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() =  1))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPersonName",
			"ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityHasNationalProviderId",
			"WARNING");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityHasNationalProviderId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant2 The receiving '<em><b>Physicianof Record Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(
			PhysicianofRecordParticipant2 physicianofRecordParticipant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson",
			"WARNING");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT2__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PhysicianofRecordParticipant2Operations
