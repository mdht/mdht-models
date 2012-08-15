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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Tuberculosis Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateSilicosisHistoryOfTuberculosisObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateSilicosisHistoryOfTuberculosisObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisHistoryOfTuberculosisObservationOperations extends ProblemObservationOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SilicosisHistoryOfTuberculosisObservationOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateSilicosisHistoryOfTuberculosisObservationClassCode(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSilicosisHistoryOfTuberculosisObservationClassCode(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

  /**
	 * The cached OCL invariant for the '{@link #validateSilicosisHistoryOfTuberculosisObservationClassCode(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSilicosisHistoryOfTuberculosisObservationClassCode(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param silicosisHistoryOfTuberculosisObservation The receiving '<em><b>History Of Tuberculosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateSilicosisHistoryOfTuberculosisObservationClassCode(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION);
			try {
				VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisHistoryOfTuberculosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE,
						 SilicosisPlugin.INSTANCE.getString("SilicosisHistoryOfTuberculosisObservationClassCode"),
						 new Object [] { silicosisHistoryOfTuberculosisObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateSilicosisHistoryOfTuberculosisObservationValue(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSilicosisHistoryOfTuberculosisObservationValue(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

  /**
	 * The cached OCL invariant for the '{@link #validateSilicosisHistoryOfTuberculosisObservationValue(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSilicosisHistoryOfTuberculosisObservationValue(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))
	 * @param silicosisHistoryOfTuberculosisObservation The receiving '<em><b>History Of Tuberculosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateSilicosisHistoryOfTuberculosisObservationValue(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION);
			try {
				VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisHistoryOfTuberculosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE,
						 SilicosisPlugin.INSTANCE.getString("SilicosisHistoryOfTuberculosisObservationValue"),
						 new Object [] { silicosisHistoryOfTuberculosisObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.107')";

  /**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(SilicosisHistoryOfTuberculosisObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.107')
	 * @param silicosisHistoryOfTuberculosisObservation The receiving '<em><b>History Of Tuberculosis Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateProblemObservationTemplateId(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisHistoryOfTuberculosisObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(silicosisHistoryOfTuberculosisObservation, context) }),
						 new Object [] { silicosisHistoryOfTuberculosisObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // SilicosisHistoryOfTuberculosisObservationOperations