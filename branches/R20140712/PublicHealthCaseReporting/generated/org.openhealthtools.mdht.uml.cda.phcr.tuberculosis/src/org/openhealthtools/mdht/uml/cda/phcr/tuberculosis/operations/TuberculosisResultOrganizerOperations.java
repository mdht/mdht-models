/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateTuberculosisResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateTuberculosisResultOrganizerTuberculosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Tuberculosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#getTuberculosisResultObservations() <em>Get Tuberculosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisResultOrganizerOperations extends ResultOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisResultOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisResultOrganizerCode(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisResultOrganizerCode(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateTuberculosisResultOrganizerCode(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTuberculosisResultOrganizerCode(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param tuberculosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTuberculosisResultOrganizerCode(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_RESULT_ORGANIZER);
			try {
				VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_RESULT_ORGANIZER__TUBERCULOSIS_RESULT_ORGANIZER_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisResultOrganizerCode"),
						 new Object [] { tuberculosisResultOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTuberculosisResultOrganizerTuberculosisResultObservation(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Tuberculosis Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisResultOrganizerTuberculosisResultObservation(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisResultOrganizerTuberculosisResultObservation(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Tuberculosis Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisResultOrganizerTuberculosisResultObservation(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation))
	 * @param tuberculosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisResultOrganizerTuberculosisResultObservation(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_RESULT_ORGANIZER);
			try {
				VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_RESULT_ORGANIZER__TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisResultOrganizerTuberculosisResultObservation"),
						 new Object [] { tuberculosisResultOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTuberculosisResultObservations(TuberculosisResultOrganizer) <em>Get Tuberculosis Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisResultObservations(TuberculosisResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation)).oclAsType(tuberculosis::TuberculosisResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getTuberculosisResultObservations(TuberculosisResultOrganizer) <em>Get Tuberculosis Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuberculosisResultObservations(TuberculosisResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tuberculosis::TuberculosisResultObservation)).oclAsType(tuberculosis::TuberculosisResultObservation)
	 * @param tuberculosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<TuberculosisResultObservation> getTuberculosisResultObservations(TuberculosisResultOrganizer tuberculosisResultOrganizer) {
		if (GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TuberculosisPackage.Literals.TUBERCULOSIS_RESULT_ORGANIZER, TuberculosisPackage.Literals.TUBERCULOSIS_RESULT_ORGANIZER.getEAllOperations().get(75));
			try {
				GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TUBERCULOSIS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TuberculosisResultObservation> result = (Collection<TuberculosisResultObservation>) query.evaluate(tuberculosisResultOrganizer);
		return new BasicEList.UnmodifiableEList<TuberculosisResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(TuberculosisResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.21')
	 * @param tuberculosisResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultOrganizerTemplateId(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultOrganizerTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisResultOrganizer, context) }),
						 new Object [] { tuberculosisResultOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisResultOrganizerOperations