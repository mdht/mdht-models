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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SignsAndSymptomsObservationOperations;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signs And Symptoms Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation#validatePertussisSignsAndSymptomsObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Signs And Symptoms Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation#validatePertussisSignsAndSymptomsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Signs And Symptoms Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisSignsAndSymptomsObservationOperations extends SignsAndSymptomsObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisSignsAndSymptomsObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePertussisSignsAndSymptomsObservationValueP(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Signs And Symptoms Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePertussisSignsAndSymptomsObservationValueP(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

  /**
	 * The cached OCL invariant for the '{@link #validatePertussisSignsAndSymptomsObservationValueP(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Signs And Symptoms Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePertussisSignsAndSymptomsObservationValueP(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param pertussisSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validatePertussisSignsAndSymptomsObservationValueP(PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);
			try {
				VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisSignsAndSymptomsObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P,
						 PertussisPlugin.INSTANCE.getString("PertussisSignsAndSymptomsObservationValueP"),
						 new Object [] { pertussisSignsAndSymptomsObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservationValueP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservationValueP", passToken);
				}
				passToken.add(pertussisSignsAndSymptomsObservation);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validatePertussisSignsAndSymptomsObservationValue(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Signs And Symptoms Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePertussisSignsAndSymptomsObservationValue(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '49727002' or value.code = '284523002' or value.code = '60537006' or value.code = '43025008' or value.code = '422400008' or value.code = '424580008' or value.code = '1023001' or value.code = '3415004' or value.code = '233604007' or value.code = '70995007' or value.code = '91175000' or value.code = '44186003' or value.code = '405737000' or value.code = '304213008' or value.code = '76067001' or value.code = '60119000' or value.code = '267102003' or value.code = '81308009')))";

  /**
	 * The cached OCL invariant for the '{@link #validatePertussisSignsAndSymptomsObservationValue(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Signs And Symptoms Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePertussisSignsAndSymptomsObservationValue(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '49727002' or value.code = '284523002' or value.code = '60537006' or value.code = '43025008' or value.code = '422400008' or value.code = '424580008' or value.code = '1023001' or value.code = '3415004' or value.code = '233604007' or value.code = '70995007' or value.code = '91175000' or value.code = '44186003' or value.code = '405737000' or value.code = '304213008' or value.code = '76067001' or value.code = '60119000' or value.code = '267102003' or value.code = '81308009')))
	 * @param pertussisSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validatePertussisSignsAndSymptomsObservationValue(PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSignsAndSymptomsObservationValueP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(pertussisSignsAndSymptomsObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);
			try {
				VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisSignsAndSymptomsObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE,
						 PertussisPlugin.INSTANCE.getString("PertussisSignsAndSymptomsObservationValue"),
						 new Object [] { pertussisSignsAndSymptomsObservation }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateSignsAndSymptomsObservationTemplateId(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignsAndSymptomsObservationTemplateId(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.66')";

	/**
	 * The cached OCL invariant for the '{@link #validateSignsAndSymptomsObservationTemplateId(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSignsAndSymptomsObservationTemplateId(PertussisSignsAndSymptomsObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.66')
	 * @param pertussisSignsAndSymptomsObservation The receiving '<em><b>Signs And Symptoms Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSignsAndSymptomsObservationTemplateId(PertussisSignsAndSymptomsObservation pertussisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION);
			try {
				VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisSignsAndSymptomsObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SignsAndSymptomsObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisSignsAndSymptomsObservation, context) }),
						 new Object [] { pertussisSignsAndSymptomsObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // PertussisSignsAndSymptomsObservationOperations