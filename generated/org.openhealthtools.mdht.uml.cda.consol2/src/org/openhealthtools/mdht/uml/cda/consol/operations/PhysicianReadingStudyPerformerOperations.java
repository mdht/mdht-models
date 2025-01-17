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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has DICOM</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformerOperations extends ParticipationOperations {
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
	protected PhysicianReadingStudyPerformerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTemplateId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianReadingStudyPerformerTemplateId(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerTemplateId", "ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerTemplateId"),
						new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTime(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianReadingStudyPerformerTime(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerTime", "INFO");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_TIME,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerTime"),
						new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::x_ServiceEventPerformer::PRF";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerTypeCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianReadingStudyPerformerTypeCode(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerTypeCode", "ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerTypeCode"),
						new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntity(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePhysicianReadingStudyPerformerAssignedEntity(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntity", "ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				physicianReadingStudyPerformer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString(
							"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntity"),
						new Object[] { physicianReadingStudyPerformer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 8))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS",
			"ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 12))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS",
			"WARNING");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 14))))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS",
			"INFO");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time->excluding(null)->select(isNullFlavorUndefined())->reject((not value.oclIsUndefined() and value.size() > 8 implies value.size() >= 15) and ((not low.value.oclIsUndefined() and low.value.size() > 8 implies low.value.size() >= 15) and (not high.value.oclIsUndefined() and high.value.size() > 8 implies high.value.size() >= 15)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS",
			"WARNING");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId",
			"WARNING");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has DICOM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(code.codeSystem = '1.2.840.10008.2.16.4' or code.codeSystem = '2.16.840.1.113883.6.101')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has DICOM</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerAssignedEntityHasDICOM(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityHasDICOM", "ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_DICOM,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityHasDICOM"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has Assigned Person Or Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(not assignedPerson->isEmpty() or  not representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has Assigned Person Or Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has National Provider Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Has National Provider Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityHasNationalProviderId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization",
			"ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityHasAssignedPersonOrRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerAssignedEntityCode(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityCode", "ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityId(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianReadingStudyPerformerAssignedEntityCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianReadingStudyPerformerAssignedEntityCode(PhysicianReadingStudyPerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicianReadingStudyPerformer The receiving '<em><b>Physician Reading Study Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePhysicianReadingStudyPerformerAssignedEntityId(
			PhysicianReadingStudyPerformer physicianReadingStudyPerformer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityId", "ERROR");

		if (VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			physicianReadingStudyPerformer);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER__PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"PhysicianReadingStudyPerformerPhysicianReadingStudyPerformerAssignedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PhysicianReadingStudyPerformerOperations
