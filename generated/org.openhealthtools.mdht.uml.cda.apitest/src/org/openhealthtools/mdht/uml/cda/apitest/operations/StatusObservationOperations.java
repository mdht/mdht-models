/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.StatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation#getValue() <em>Get Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation#getText() <em>Get Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.StatusObservation#validateStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusObservationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Observation toCDAType(StatusObservation statusObservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getValue(StatusObservation) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue(StatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VALUE__EOCL_EXP = "self.value.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getValue(StatusObservation) <em>Get Value</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue(StatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VALUE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * self.value.oclAsType(datatypes::CE)
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static CE getValue(StatusObservation statusObservation) {
		if (GET_VALUE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.ISTATUS_OBSERVATION,
				DomainPackage.Literals.ISTATUS_OBSERVATION.getEAllOperations().get(1));
			try {
				GET_VALUE__EOCL_QRY = helper.createQuery(GET_VALUE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VALUE__EOCL_QRY);
		return (CE) query.evaluate(statusObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #getText(StatusObservation) <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(StatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT__EOCL_EXP = "self.text.oclAsType(datatypes::ED)";

	/**
	 * The cached OCL query for the '{@link #getText(StatusObservation) <em>Get Text</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(StatusObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TEXT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::text.
	 * self.text.oclAsType(datatypes::ED)
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ED getText(StatusObservation statusObservation) {
		if (GET_TEXT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				DomainPackage.Literals.ISTATUS_OBSERVATION,
				DomainPackage.Literals.ISTATUS_OBSERVATION.getEAllOperations().get(4));
			try {
				GET_TEXT__EOCL_QRY = helper.createQuery(GET_TEXT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TEXT__EOCL_QRY);
		return (ED) query.evaluate(statusObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->isEmpty()
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationNoAdditionalParticipants(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS,
					APITestPlugin.INSTANCE.getString("StatusObservationNoAdditionalParticipants"),
					new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationHasTextReference(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Has Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationHasTextReference(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.reference.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationHasTextReference(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Has Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationHasTextReference(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.reference.oclIsUndefined()
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationHasTextReference(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_HAS_TEXT_REFERENCE,
					APITestPlugin.INSTANCE.getString("StatusObservationHasTextReference"),
					new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.57')";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.57')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationTemplateId(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID,
					APITestPlugin.INSTANCE.getString("StatusObservationTemplateId"), new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationClassCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE,
					APITestPlugin.INSTANCE.getString("StatusObservationClassCode"), new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationMoodCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE,
					APITestPlugin.INSTANCE.getString("StatusObservationMoodCode"), new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationStatusCode(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE,
					APITestPlugin.INSTANCE.getString("StatusObservationStatusCode"), new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE)))
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationValue(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE,
					APITestPlugin.INSTANCE.getString("StatusObservationValue"), new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationText(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationText(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationText(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationText(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateStatusObservationText(StatusObservation statusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_TEXT,
					APITestPlugin.INSTANCE.getString("StatusObservationText"), new Object[] { statusObservation }));
			}
			return false;
		}
		return true;
	}

} // StatusObservationOperations
