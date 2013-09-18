/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Smoking Status Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmokingStatusObservationOperations extends org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusObservationOperations {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected SmokingStatusObservationOperations() {
    super();
  }

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateTobaccoUseTemplateId(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Tobacco Use Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateTobaccoUseTemplateId(SmokingStatusObservation,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.78')";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateTobaccoUseTemplateId(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Tobacco Use Template Id</em>}' invariant operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateTobaccoUseTemplateId(SmokingStatusObservation,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.22.4.78')
	 * 
	 * @param smokingStatusObservation
	 *            The receiving '<em><b>Smoking Status Observation</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateTobaccoUseTemplateId(
			SmokingStatusObservation smokingStatusObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.SMOKING_STATUS_OBSERVATION);
      try
      {
        VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(smokingStatusObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.SMOKING_STATUS_OBSERVATION__TOBACCO_USE_TEMPLATE_ID,
             Mu2consolPlugin.INSTANCE.getString("SmokingStatusObservationTobaccoUseTemplateId"),
             new Object [] { smokingStatusObservation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSmokingStatusObservationValueP(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSmokingStatusObservationValueP(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
   * The cached OCL invariant for the '{@link #validateSmokingStatusObservationValueP(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSmokingStatusObservationValueP(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param smokingStatusObservation The receiving '<em><b>Smoking Status Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSmokingStatusObservationValueP(SmokingStatusObservation smokingStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.SMOKING_STATUS_OBSERVATION);
      try
      {
        VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(smokingStatusObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.SMOKING_STATUS_OBSERVATION__SMOKING_STATUS_OBSERVATION_VALUE_P,
             Mu2consolPlugin.INSTANCE.getString("SmokingStatusObservationSmokingStatusObservationValueP"),
             new Object [] { smokingStatusObservation }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservationValueP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservationValueP", passToken);
        }
        passToken.add(smokingStatusObservation);
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSmokingStatusObservationValue(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSmokingStatusObservationValue(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '449868002' or value.code = '428041000124106' or value.code = '8517006' or value.code = '266919005' or value.code = '77176002' or value.code = '266927001' or value.code = '428071000124103' or value.code = '428061000124105')))";

	/**
   * The cached OCL invariant for the '{@link #validateSmokingStatusObservationValue(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSmokingStatusObservationValue(SmokingStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param smokingStatusObservation The receiving '<em><b>Smoking Status Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSmokingStatusObservationValue(SmokingStatusObservation smokingStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservationValueP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(smokingStatusObservation)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.SMOKING_STATUS_OBSERVATION);
      try
      {
        VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(smokingStatusObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.SMOKING_STATUS_OBSERVATION__SMOKING_STATUS_OBSERVATION_VALUE,
             Mu2consolPlugin.INSTANCE.getString("SmokingStatusObservationSmokingStatusObservationValue"),
             new Object [] { smokingStatusObservation }));
      }
       
      return false;
    }
    return true;
  }

} // SmokingStatusObservationOperations