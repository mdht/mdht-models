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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProductInstanceOperations;
import org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHMR Product Instance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstanceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstanceScopingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Scoping Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstancePlayingDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Playing Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validateProductInstanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PHMRProductInstanceOperations extends ProductInstanceOperations {
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
	protected PHMRProductInstanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePHMRProductInstanceCode(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceCode(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePHMRProductInstanceCode(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceCode(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param phmrProductInstance The receiving '<em><b>PHMR Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePHMRProductInstanceCode(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE);
			try {
				VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(phmrProductInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_CODE,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstancePHMRProductInstanceCode"),
						 new Object [] { phmrProductInstance }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePHMRProductInstanceId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePHMRProductInstanceId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param phmrProductInstance The receiving '<em><b>PHMR Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePHMRProductInstanceId(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE);
			try {
				VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(phmrProductInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_ID,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstancePHMRProductInstanceId"),
						 new Object [] { phmrProductInstance }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePHMRProductInstanceScopingEntity(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Scoping Entity</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceScopingEntity(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))";

  /**
	 * The cached OCL invariant for the '{@link #validatePHMRProductInstanceScopingEntity(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Scoping Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceScopingEntity(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param phmrProductInstance The receiving '<em><b>PHMR Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validatePHMRProductInstanceScopingEntity(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE);
			try {
				VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(phmrProductInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstancePHMRProductInstanceScopingEntity"),
						 new Object [] { phmrProductInstance }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validatePHMRProductInstancePlayingDevice(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Playing Device</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstancePlayingDevice(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingDevice->one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))";

  /**
	 * The cached OCL invariant for the '{@link #validatePHMRProductInstancePlayingDevice(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Playing Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstancePlayingDevice(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param phmrProductInstance The receiving '<em><b>PHMR Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validatePHMRProductInstancePlayingDevice(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE);
			try {
				VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(phmrProductInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE__PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstancePHMRProductInstancePlayingDevice"),
						 new Object [] { phmrProductInstance }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProductInstanceTemplateId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceTemplateId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstanceTemplateId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceTemplateId(PHMRProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param phmrProductInstance The receiving '<em><b>PHMR Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProductInstanceTemplateId(PHMRProductInstance phmrProductInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(phmrProductInstance)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstanceProductInstanceTemplateId"),
						 new Object [] { phmrProductInstance }));
			}
			 
			return false;
		}
		return true;
	}

} // PHMRProductInstanceOperations