/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.mdht.uml.hl7.rim.operations.ParticipationOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has DICOM Or NUCC Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianofRecordParticipantOperations extends ParticipationOperations {
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
	protected PhysicianofRecordParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianofRecordParticipantTemplateId(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PhysicianofRecordParticipantPhysicianofRecordParticipantTemplateId", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianofRecordParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianofRecordParticipantPhysicianofRecordParticipantTemplateId"),
						new Object[] { physicianofRecordParticipant }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::x_EncounterParticipant::ATND";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianofRecordParticipantTypeCode(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PhysicianofRecordParticipantPhysicianofRecordParticipantTypeCode", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianofRecordParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianofRecordParticipantPhysicianofRecordParticipantTypeCode"),
						new Object[] { physicianofRecordParticipant }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianofRecordParticipantAssignedEntity(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntity", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
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
				physicianofRecordParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntity"),
						new Object[] { physicianofRecordParticipant }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (( not name->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityAssignedPersonName",
			"WARNING");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
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
			physicianofRecordParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityAssignedPersonName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has DICOM Or NUCC Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(code.codeSystem = '1.2.840.10008.2.16.4' or code.codeSystem = '2.16.840.1.113883.6.101')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has DICOM Or NUCC Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode",
			"ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityHasNationalProviderId",
			"WARNING");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
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
			physicianofRecordParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityHasNationalProviderId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityCode(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityCode", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityId(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityId", "ERROR");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianofRecordParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityAssignedPerson", "WARNING");

		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
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
			physicianofRecordParticipant);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianofRecordParticipantPhysicianofRecordParticipantAssignedEntityAssignedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PhysicianofRecordParticipantOperations
