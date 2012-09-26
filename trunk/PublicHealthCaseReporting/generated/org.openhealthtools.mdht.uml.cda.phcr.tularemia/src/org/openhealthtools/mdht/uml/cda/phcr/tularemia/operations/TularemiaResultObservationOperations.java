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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation#validateTularemiaResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation#validateTularemiaResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaResultObservationOperations extends ResultObservationOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaResultObservationOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaResultObservationCodeP(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaResultObservationCodeP(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaResultObservationCodeP(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaResultObservationCodeP(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param tularemiaResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateTularemiaResultObservationCodeP(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_RESULT_OBSERVATION);
			try {
				VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_RESULT_OBSERVATION__TULAREMIA_RESULT_OBSERVATION_CODE_P,
						 TularemiaPlugin.INSTANCE.getString("TularemiaResultObservationCodeP"),
						 new Object [] { tularemiaResultObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservationCodeP", passToken);
				}
				passToken.add(tularemiaResultObservation);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaResultObservationCode(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaResultObservationCode(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaResultObservationCode(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaResultObservationCode(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param tularemiaResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTularemiaResultObservationCode(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(tularemiaResultObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_RESULT_OBSERVATION);
			try {
				VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_RESULT_OBSERVATION__TULAREMIA_RESULT_OBSERVATION_CODE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaResultObservationCode"),
						 new Object [] { tularemiaResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.51')";

  /**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(TularemiaResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.51')
	 * @param tularemiaResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateResultObservationTemplateId(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_RESULT_OBSERVATION);
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaResultObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaResultObservation, context) }),
						 new Object [] { tularemiaResultObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // TularemiaResultObservationOperations