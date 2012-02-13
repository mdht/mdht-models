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

import org.openhealthtools.mdht.uml.cda.operations.DeviceOperations;

import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;
import org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Playing Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice#validatePlayingDeviceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice#validatePlayingDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice#validatePlayingDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Manufacturer Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayingDeviceOperations extends DeviceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayingDeviceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlayingDeviceTemplateId(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingDeviceTemplateId(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlayingDeviceTemplateId(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingDeviceTemplateId(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'null')
	 * @param playingDevice The receiving '<em><b>Playing Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlayingDeviceTemplateId(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PLAYING_DEVICE);
			try {
				VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(playingDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PLAYING_DEVICE__PLAYING_DEVICE_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("PlayingDeviceTemplateId"),
						 new Object [] { playingDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlayingDeviceCode(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingDeviceCode(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.24'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlayingDeviceCode(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingDeviceCode(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.24'))
	 * @param playingDevice The receiving '<em><b>Playing Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlayingDeviceCode(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PLAYING_DEVICE);
			try {
				VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(playingDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PLAYING_DEVICE__PLAYING_DEVICE_CODE,
						 PhmrPlugin.INSTANCE.getString("PlayingDeviceCode"),
						 new Object [] { playingDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlayingDeviceManufacturerModelName(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Manufacturer Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingDeviceManufacturerModelName(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlayingDeviceManufacturerModelName(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Manufacturer Model Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingDeviceManufacturerModelName(PlayingDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())
	 * @param playingDevice The receiving '<em><b>Playing Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlayingDeviceManufacturerModelName(PlayingDevice playingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PLAYING_DEVICE);
			try {
				VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(playingDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PLAYING_DEVICE__PLAYING_DEVICE_MANUFACTURER_MODEL_NAME,
						 PhmrPlugin.INSTANCE.getString("PlayingDeviceManufacturerModelName"),
						 new Object [] { playingDevice }));
			}
			return false;
		}
		return true;
	}

} // PlayingDeviceOperations