/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estimated Date Of Delivery Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstimatedDateOfDeliveryObservationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EstimatedDateOfDeliveryObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationTemplateId(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationTemplateId(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationTemplateId(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationTemplateId(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.1')
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEstimatedDateOfDeliveryObservationTemplateId(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationTemplateId"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationClassCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationClassCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationClassCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationClassCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEstimatedDateOfDeliveryObservationClassCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationClassCode"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '11778-8' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEstimatedDateOfDeliveryObservationCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(estimatedDateOfDeliveryObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationCode"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationMoodCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationMoodCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationMoodCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationMoodCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEstimatedDateOfDeliveryObservationMoodCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationMoodCode"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '11778-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEstimatedDateOfDeliveryObservationCodeP(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationCodeP"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservationCodeP", passToken);
				}
				passToken.add(estimatedDateOfDeliveryObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationStatusCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationStatusCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationStatusCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationStatusCode(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEstimatedDateOfDeliveryObservationStatusCode(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationStatusCode"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationStatusCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationStatusCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationStatusCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationStatusCodeP(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEstimatedDateOfDeliveryObservationStatusCodeP(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationStatusCodeP"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryObservationValue(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationValue(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryObservationValue(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryObservationValue(EstimatedDateOfDeliveryObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))
	 * @param estimatedDateOfDeliveryObservation The receiving '<em><b>Estimated Date Of Delivery Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateEstimatedDateOfDeliveryObservationValue(EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(estimatedDateOfDeliveryObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION__ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE,
						 PhcrPlugin.INSTANCE.getString("EstimatedDateOfDeliveryObservationValue"),
						 new Object [] { estimatedDateOfDeliveryObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // EstimatedDateOfDeliveryObservationOperations