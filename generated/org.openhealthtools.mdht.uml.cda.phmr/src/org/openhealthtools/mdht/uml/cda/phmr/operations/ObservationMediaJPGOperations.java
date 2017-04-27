/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observation Media JPG</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationMediaJPGOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected ObservationMediaJPGOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationMediaJPGTemplateId(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGTemplateId(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationMediaJPGTemplateId(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGTemplateId(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observationMediaJPG The receiving '<em><b>Observation Media JPG</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationMediaJPGTemplateId(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_MEDIA_JPG);
			try {
				VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(observationMediaJPG)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("ObservationMediaJPGObservationMediaJPGTemplateId"),
						 new Object [] { observationMediaJPG }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationMediaJPGClassCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGClassCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationMediaJPGClassCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGClassCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observationMediaJPG The receiving '<em><b>Observation Media JPG</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationMediaJPGClassCode(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_MEDIA_JPG);
			try {
				VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(observationMediaJPG)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_CLASS_CODE,
						 PhmrPlugin.INSTANCE.getString("ObservationMediaJPGObservationMediaJPGClassCode"),
						 new Object [] { observationMediaJPG }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationMediaJPGMoodCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGMoodCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationMediaJPGMoodCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGMoodCode(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observationMediaJPG The receiving '<em><b>Observation Media JPG</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationMediaJPGMoodCode(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_MEDIA_JPG);
			try {
				VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(observationMediaJPG)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_MOOD_CODE,
						 PhmrPlugin.INSTANCE.getString("ObservationMediaJPGObservationMediaJPGMoodCode"),
						 new Object [] { observationMediaJPG }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateObservationMediaJPGValue(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGValue(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value.oclIsUndefined() or self.value.isNullFlavorUndefined()) implies (not self.value.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateObservationMediaJPGValue(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateObservationMediaJPGValue(ObservationMediaJPG, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param observationMediaJPG The receiving '<em><b>Observation Media JPG</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateObservationMediaJPGValue(ObservationMediaJPG observationMediaJPG, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.OBSERVATION_MEDIA_JPG);
			try {
				VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(observationMediaJPG)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.OBSERVATION_MEDIA_JPG__OBSERVATION_MEDIA_JPG_VALUE,
						 PhmrPlugin.INSTANCE.getString("ObservationMediaJPGObservationMediaJPGValue"),
						 new Object [] { observationMediaJPG }));
			}
			 
			return false;
		}
		return true;
	}

} // ObservationMediaJPGOperations